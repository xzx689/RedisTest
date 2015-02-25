package ihandy.redis.util;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSlotBasedConnectionHandler;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class JedisConnection extends JedisSlotBasedConnectionHandler {

	

	private Set<HostAndPort> hnps = new HashSet<HostAndPort>();

	public JedisConnection(Set<HostAndPort> nodes) {
		super(nodes);
		this.hnps = nodes;
	}

	@Override
	public void returnConnection(Jedis connection) {
		super.returnConnection(connection);
	}

	public Jedis getConnection(HostAndPort hostAndPort) {

		JedisPool jp = nodes.get(hostAndPort.getHost() + ":"
				+ hostAndPort.getPort());
		
		Jedis jedis = null;
		try {
			jedis = jp.getResource();

			String result = jedis.ping();

			if (result.equalsIgnoreCase("pong")) {
				return jedis;
			}

		} catch (JedisConnectionException ex) {
			if (jedis != null) {
				jp.returnBrokenResource(jedis);
			}
		} finally {
			jp.returnResource(jedis);
		}
		throw new JedisConnectionException("no reachable node in cluster");
	}

	public Jedis getLocalConnect() {
		Jedis jedis = null;
		for (HostAndPort hostAndPort : hnps) {
			JedisPool jp = new JedisPool(hostAndPort.getHost(),
					hostAndPort.getPort());


					
			try {
				jedis = jp.getResource();
				break;
			} catch (JedisConnectionException e) {
				if (jedis != null) {
					jp.returnBrokenResource(jedis);
					jedis = null;
				}

			}
		}

		String localNodes = jedis.clusterNodes();

		JedisPool jp = null;
		Jedis jedisLocal = null;

		

		return null != jedisLocal ? jedisLocal : getConnection();
	}
}

