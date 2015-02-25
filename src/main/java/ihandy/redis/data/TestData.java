package ihandy.redis.data;

import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import com.ihandy.utils.BufferUtil;
import com.ihandy.utils.ProtocolUtil;

public class TestData {
	
	//int 4 字节
	private int int0;
	private int int1;
	private int int2;
	private int int3;
	private int int4;
	private int int5;
	private int int6;
	private int int7;
	private int int8;
	private int int9;
	//long 8 字节
	private long long0;
	private long long1;
	private long long2;
	private long long3;
	private long long4;
	private long long5;
	private long long6;
	private long long7;
	private long long8;
	private long long9;
	
	//String 40     字节 
	private String str0; 
	private String str1; 
	private String str2;
	private String str3; 
	private String str4; 
	private String str5; 
	private String str6; 
	private String str7; 
	private String str8; 
	private String str9;
	
	public int getInt0() {
		return int0;
	}
	public void setInt0(int int0) {
		this.int0 = int0;
	}
	public int getInt1() {
		return int1;
	}
	public void setInt1(int int1) {
		this.int1 = int1;
	}
	public int getInt2() {
		return int2;
	}
	public void setInt2(int int2) {
		this.int2 = int2;
	}
	public int getInt3() {
		return int3;
	}
	public void setInt3(int int3) {
		this.int3 = int3;
	}
	public int getInt4() {
		return int4;
	}
	public void setInt4(int int4) {
		this.int4 = int4;
	}
	public int getInt5() {
		return int5;
	}
	public void setInt5(int int5) {
		this.int5 = int5;
	}
	public int getInt6() {
		return int6;
	}
	public void setInt6(int int6) {
		this.int6 = int6;
	}
	public int getInt7() {
		return int7;
	}
	public void setInt7(int int7) {
		this.int7 = int7;
	}
	public int getInt8() {
		return int8;
	}
	public void setInt8(int int8) {
		this.int8 = int8;
	}
	public int getInt9() {
		return int9;
	}
	public void setInt9(int int9) {
		this.int9 = int9;
	}
	public long getLong0() {
		return long0;
	}
	public void setLong0(long long0) {
		this.long0 = long0;
	}
	public long getLong1() {
		return long1;
	}
	public void setLong1(long long1) {
		this.long1 = long1;
	}
	public long getLong2() {
		return long2;
	}
	public void setLong2(long long2) {
		this.long2 = long2;
	}
	public long getLong3() {
		return long3;
	}
	public void setLong3(long long3) {
		this.long3 = long3;
	}
	public long getLong4() {
		return long4;
	}
	public void setLong4(long long4) {
		this.long4 = long4;
	}
	public long getLong5() {
		return long5;
	}
	public void setLong5(long long5) {
		this.long5 = long5;
	}
	public long getLong6() {
		return long6;
	}
	public void setLong6(long long6) {
		this.long6 = long6;
	}
	public long getLong7() {
		return long7;
	}
	public void setLong7(long long7) {
		this.long7 = long7;
	}
	public long getLong8() {
		return long8;
	}
	public void setLong8(long long8) {
		this.long8 = long8;
	}
	public long getLong9() {
		return long9;
	}
	public void setLong9(long long9) {
		this.long9 = long9;
	}
	public String getStr0() {
		return str0;
	}
	public void setStr0(String str0) {
		this.str0 = str0;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	public String getStr4() {
		return str4;
	}
	public void setStr4(String str4) {
		this.str4 = str4;
	}
	public String getStr5() {
		return str5;
	}
	public void setStr5(String str5) {
		this.str5 = str5;
	}
	public String getStr6() {
		return str6;
	}
	public void setStr6(String str6) {
		this.str6 = str6;
	}
	public String getStr7() {
		return str7;
	}
	public void setStr7(String str7) {
		this.str7 = str7;
	}
	public String getStr8() {
		return str8;
	}
	public void setStr8(String str8) {
		this.str8 = str8;
	}
	public String getStr9() {
		return str9;
	}
	public void setStr9(String str9) {
		this.str9 = str9;
	} 
	
	private static AtomicInteger seqid = new AtomicInteger(0);
	private static SecureRandom random = new SecureRandom();

	public TestData getSampleMsg() {
		this.setInt0(seqid.intValue());
		this.setInt1(random.nextInt());
		this.setInt2(2);
		this.setInt3(3);
		this.setInt4(4);
		this.setInt5(5);
		this.setInt6(6);
		this.setInt7(7);
		this.setInt8(8);
		this.setInt9(9);
		
		this.setLong0(10);
		this.setLong1(11);
		this.setLong2(12);
		this.setLong3(13);
		this.setLong4(14);
		this.setLong5(15);
		this.setLong6(16);
		this.setLong7(17);
		this.setLong8(18);
		this.setLong9(19);
		
		this.setStr0("君不见，黄河之水天上来，奔流到海不复回。");
		this.setStr1("君不见，高堂明镜悲白发，朝如青丝暮成雪。");
		this.setStr2("人生得意须尽欢，莫使金樽空对月。天生我材必有用，千金散尽还复来。");
		this.setStr3("烹羊宰牛且为乐，会须一饮三百杯。岑夫子，丹丘生，将进酒，杯莫停。");
		this.setStr4("与君歌一曲，请君为我倾耳听。钟鼓馔玉不足贵，但愿长醉不复醒。");
		this.setStr5("古来圣贤皆寂寞，惟有饮者留其名。");
		this.setStr6("陈王昔时宴平乐，斗酒十千恣欢谑。");
		this.setStr7("主人何为言少钱，径须沽取对君酌。");
		this.setStr8("五花马，千金裘，呼儿将出换美酒，与尔同消万古愁。");
		this.setStr9("李白，唐，《将进酒》");
	
		return this;
	}

	public Map<String, String> getMap(){
		
		Map<String ,String > dataMap =new HashMap<String ,String>();
		
		TestData testData = new TestData();
		testData=getSampleMsg();
		
		//把一个对象转成Map没有好的方法，网上有用反射的，先手写吧
		
		
		dataMap.put("int0",testData.getInt0()+"");
		dataMap.put("int1",testData.getInt1()+"");
		dataMap.put("int2",testData.getInt2()+"");
		dataMap.put("int3",testData.getInt3()+"");
		dataMap.put("int4",testData.getInt4()+"");
		dataMap.put("int5",testData.getInt5()+"");
		dataMap.put("int6",testData.getInt6()+"");
		dataMap.put("int7",testData.getInt7()+"");
		dataMap.put("int8",testData.getInt8()+"");
		dataMap.put("int9",testData.getInt9()+"");
		
		dataMap.put("long0",testData.getLong0()+"");
		dataMap.put("long1",testData.getLong1()+"");
		dataMap.put("long2",testData.getLong2()+"");
		dataMap.put("long3",testData.getLong3()+"");
		dataMap.put("long4",testData.getLong4()+"");
		dataMap.put("long5",testData.getLong5()+"");
		dataMap.put("long6",testData.getLong6()+"");
		dataMap.put("long7",testData.getLong7()+"");
		dataMap.put("long8",testData.getLong8()+"");
		dataMap.put("long9",testData.getLong9()+"");

		dataMap.put("str0",testData.getStr0());
		dataMap.put("str1",testData.getStr1());
		dataMap.put("str2",testData.getStr2());
		dataMap.put("str3",testData.getStr3());
		dataMap.put("str4",testData.getStr4());
		dataMap.put("str5",testData.getStr5());
		dataMap.put("str6",testData.getStr6());
		dataMap.put("str7",testData.getStr7());
		dataMap.put("str8",testData.getStr8());
		dataMap.put("str9",testData.getStr9());
	
		return  dataMap;
	}
	public ByteBuffer toBuffer() {
		TestData testData = getSampleMsg();
	
		//ByteBuffer b = ByteBuffer.wrap(BufferUtil.tmpBuffer());
		ByteBuffer b=ByteBuffer.allocate(2048);
		b.putInt(testData.getInt0());
		b.putInt(testData.getInt1());
		b.putInt(testData.getInt2());
		b.putInt(testData.getInt3());
		b.putInt(testData.getInt4());
		b.putInt(testData.getInt5());
		b.putInt(testData.getInt6());
		b.putInt(testData.getInt7());
		b.putInt(testData.getInt8());
		b.putInt(testData.getInt9());
		
		b.putLong(testData.getLong0());
		b.putLong(testData.getLong1());
		b.putLong(testData.getLong2());
		b.putLong(testData.getLong3());
		b.putLong(testData.getLong4());
		b.putLong(testData.getLong5());
		b.putLong(testData.getLong6());
		b.putLong(testData.getLong7());
		b.putLong(testData.getLong8());
		b.putLong(testData.getLong9());
		
		//GBK
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr0(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr0(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr1(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr1(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr2(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr2(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr3(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr3(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr4(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr4(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr5(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr5(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr6(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr6(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr7(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr7(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr8(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr8(), (byte) 15));
		
		b.putInt(ProtocolUtil.str2Bytes(testData.getStr9(), (byte) 15).length);
		b.put(ProtocolUtil.str2Bytes(testData.getStr9(), (byte) 15));

		
		b.flip();
		return b;
	}
	
	
	public TestData fromBuffer(ByteBuffer b) {
		
		
		this.setInt0(b.getInt());
		this.setInt1(b.getInt());
		this.setInt2(b.getInt());
		this.setInt3(b.getInt());
		this.setInt4(b.getInt());
		this.setInt5(b.getInt());
		this.setInt6(b.getInt());
		this.setInt7(b.getInt());
		this.setInt8(b.getInt());
		this.setInt9(b.getInt());
		
		
		this.setLong0(b.getLong());
		this.setLong1(b.getLong());
		this.setLong2(b.getLong());
		this.setLong3(b.getLong());
		this.setLong4(b.getLong());
		this.setLong5(b.getLong());
		this.setLong6(b.getLong());
		this.setLong7(b.getLong());
		this.setLong8(b.getLong());
		this.setLong9(b.getLong());
		
		//GBK
		int contLength0 = b.getInt();
		byte[] cont0 ;
		cont0 = new byte[contLength0];
		 b.get(cont0);
		
		this.setStr0(ProtocolUtil.bytes2Str(cont0, (byte)15));
		
		int contLength1 = b.getInt();
		byte[] cont1 ;
		cont1 = new byte[contLength1];
		b.get(cont1);
		this.setStr1(ProtocolUtil.bytes2Str(cont1, (byte)15));
		
		int contLength2 = b.getInt();
		byte[] cont2 ;
		cont2 = new byte[contLength2];
		b.get(cont2);
		this.setStr1(ProtocolUtil.bytes2Str(cont2, (byte)15));
		
		int contLength3 = b.getInt();
		byte[] cont3 ;
		cont3 = new byte[contLength3];
		b.get(cont3);
		this.setStr1(ProtocolUtil.bytes2Str(cont3, (byte)15));
		
		int contLength4 = b.getInt();
		byte[] cont4 ;
		cont4 = new byte[contLength4];
		b.get(cont4);
		this.setStr1(ProtocolUtil.bytes2Str(cont4, (byte)15));
		
		int contLength5 = b.getInt();
		byte[] cont5 ;
		cont5 = new byte[contLength5];
		b.get(cont5);
		this.setStr1(ProtocolUtil.bytes2Str(cont5, (byte)15));
		
		int contLength6 = b.getInt();
		byte[] cont6 ;
		cont6 = new byte[contLength6];
		b.get(cont6);
		this.setStr1(ProtocolUtil.bytes2Str(cont6, (byte)15));
		
		int contLength7 = b.getInt();
		byte[] cont7 ;
		cont7 = new byte[contLength7];
		b.get(cont7);
		this.setStr1(ProtocolUtil.bytes2Str(cont7, (byte)15));
		
		int contLength8 = b.getInt();
		byte[] cont8 ;
		cont8 = new byte[contLength8];
		b.get(cont8);
		this.setStr1(ProtocolUtil.bytes2Str(cont8, (byte)15));
		
		int contLength9 = b.getInt();
		byte[] cont9 ;
		cont9 = new byte[contLength9];
		b.get(cont9);
		this.setStr1(ProtocolUtil.bytes2Str(cont9, (byte)15));
		
		return this;

		
		
	}
	
}
