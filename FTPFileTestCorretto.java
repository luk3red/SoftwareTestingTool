import org.junit.*;
import static org.junit.Assert.*;

// Game: 1005
public class FTPFileTest {

	@Test(timeout = 4000)
	public void test_1_451() throws Throwable {
		FTPFile f = new FTPFile();
		String raw = f.getRawListing();
		assertEquals(null, raw);
	}

	@Test(timeout = 4000)
	public void test_2_453() throws Throwable {
		FTPFile f = new FTPFile();
		String rawVal = "blue monkey";
		f.setRawListing(rawVal);
		String raw = f.getRawListing();		
		assertEquals(rawVal, raw);
	}

	@Test(timeout = 4000)
	public void test_3_455() throws Throwable {
		String rawVal = "blue monkey";
		FTPFile f = new FTPFile(rawVal);
		String raw = f.getRawListing();		
		assertEquals(rawVal, raw);
	}

	@Test(timeout = 4000)
	public void test_4_456() throws Throwable {
		FTPFile f = new FTPFile("");
		assertFalse(f.isValid());
	}

	@Test(timeout = 4000)
	public void test_5_457() throws Throwable {
		FTPFile f = new FTPFile();
		boolean type = f.isDirectory();
		assertEquals("first type", false, type);
		boolean file = f.isDirectory();
		assertEquals("second type",false, file);
	}

	@Test(timeout = 4000)
	public void test_6_458() throws Throwable {
		FTPFile f = new FTPFile();
		boolean type = f.isSymbolicLink();
		assertEquals("first type", false, type);
		boolean file = f.isUnknown();
		assertEquals("second type", true, file);
	}

	@Test(timeout = 4000)
	public void test_7_459() throws Throwable {
		FTPFile f = new FTPFile();
		f.setSize(Long.MAX_VALUE);
		assertEquals("first getSize", Long.MAX_VALUE, f.getSize());
		f.setSize(1);
	  	int size = 1;
		assertEquals("second getSize", size, f.getSize());
	}

	@Test(timeout = 4000)
	public void test_8_461() throws Throwable {
		String s = "test string";
		FTPFile f = new FTPFile(s);
		f.setType(FTPFile.FILE_TYPE);
		assertEquals(f.getType(), FTPFile.FILE_TYPE);
	}

	@Test(timeout = 4000)
	public void test_9_462() throws Throwable {
		FTPFile f = new FTPFile();
		f.setName("borat");
		assertEquals("borat", "borat", f.getName());
		f.setName("Murica");
		assertEquals("Murica", "Murica", f.getName());
	}

	@Test(timeout = 4000)
	public void test_10_463() throws Throwable {
		String s = "test string";
		FTPFile f = new FTPFile(s);
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertEquals(f.getType(), FTPFile.DIRECTORY_TYPE);
	}

	@Test(timeout = 4000)
	public void test_11_464() throws Throwable {
		String s = "test string";
		FTPFile f = new FTPFile(s);
		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		assertEquals(f.getType(), FTPFile.SYMBOLIC_LINK_TYPE);
	}

	@Test(timeout = 4000)
	public void test_12_465() throws Throwable {
		FTPFile f = new FTPFile();
		f.setHardLinkCount(42);
	 	int counter = 42;
		assertEquals("42", counter, f.getHardLinkCount());
		f.setHardLinkCount(Integer.MIN_VALUE);
	  	counter = Integer.MIN_VALUE;
		assertEquals("min_value", counter, f.getHardLinkCount());
	}

	@Test(timeout = 4000)
	public void test_13_466() throws Throwable {
		FTPFile f = new FTPFile();
		f.setGroup("borat");
		assertEquals("borat", "borat", f.getGroup());
		f.setGroup("Murica");
		assertEquals("Murica", "Murica", f.getGroup());
	}

	@Test(timeout = 4000)
	public void test_14_467() throws Throwable {
		String s = "test string";
		FTPFile f = new FTPFile(s);
		f.setType(FTPFile.FILE_TYPE);
		assertTrue("isFile", f.isFile());
		assertFalse("isDirectory", f.isDirectory());
	}

	@Test(timeout = 4000)
	public void test_15_468() throws Throwable {
		FTPFile f = new FTPFile();
		f.setGroup("");
		assertEquals("empty", "", f.getGroup());
		f.setGroup(null);
		assertEquals("null", null, f.getGroup());
	}

	@Test(timeout = 4000)
	public void test_16_469() throws Throwable {
		String s = "test string";
		FTPFile f = new FTPFile(s);
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertTrue(f.isDirectory());
	}

	@Test(timeout = 4000)
	public void test_17_472() throws Throwable {
		FTPFile f = new FTPFile("JAVA");
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertEquals("[Invalid: could not parse file entry]", formatted);
		
	}

	@Test(timeout = 4000)
	public void test_18_475() throws Throwable {
		FTPFile f = new FTPFile("JAVA");
		try{
		f.setPermission(FTPFile.FILE_TYPE,FTPFile.WRITE_PERMISSION,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertEquals("[Invalid: could not parse file entry]", formatted);
	}

	@Test(timeout = 4000)
	public void test_19_479() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("hasNotPermission", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION));
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION, true);
		assertTrue("hasPermission", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.WRITE_PERMISSION));
	}

	@Test(timeout = 4000)
	public void test_20_480() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("hasNotPermission", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION));
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION, true);
		assertTrue("hasPermission", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION));
	}

	@Test(timeout = 4000)
	public void test_21_481() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("hasNotPermission",f.hasPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION));
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		assertTrue("hasPermission", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION));
	}

	@Test(timeout = 4000)
	public void test_22_483() throws Throwable {
		FTPFile f = new FTPFile();
		try{
		f.setPermission(0,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertEquals("?r--------    0                         -1 null", formatted);
	}

	@Test(timeout = 4000)
	public void test_23_484() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("hasNotPermission", f.hasPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION));
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		assertTrue("hasPermission", f.hasPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION));
	}

	@Test(timeout = 4000)
	public void test_24_488() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("isNotDirectory", f.isDirectory());
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertTrue("isDirectory", f.isDirectory());
	}

	@Test(timeout = 4000)
	public void test_25_489() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.DIRECTORY_TYPE);
		
		assertEquals(true, f.isDirectory());
	}

	@Test(timeout = 4000)
	public void test_26_490() throws Throwable {
		FTPFile f = new FTPFile();
		f.setLink("");
		assertEquals("empty", "", f.getLink());
		f.setLink(null);
		assertEquals("null", null, f.getLink());
	}

	@Test(timeout = 4000)
	public void test_27_491() throws Throwable {
		FTPFile f = new FTPFile();
		f.setUser("");
		assertEquals("empty", "", f.getUser());
		f.setUser("hello");
		assertEquals("hello", "hello", f.getUser());
	}

	@Test(timeout = 4000)
	public void test_28_497() throws Throwable {
		FTPFile f = new FTPFile();
		java.util.Calendar timestamp = new java.util.GregorianCalendar ();
		f.setTimestamp(timestamp);
		try{
		f.setPermission(0,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertTrue(formatted.startsWith("?r--------    0                         -1"));
	}

	@Test(timeout = 4000)
	public void test_29_498() throws Throwable {
		FTPFile f = new FTPFile();
		java.util.Calendar timestamp = new java.util.GregorianCalendar ();
		f.setTimestamp(timestamp);
		try{
		f.setPermission(0,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertTrue("GMT", formatted.contains("GMT"));
		assertTrue("2016-08", formatted.contains("2016-08"));
	
	}

	@Test(timeout = 4000)
	public void test_30_501() throws Throwable {
		FTPFile f = new FTPFile();
		java.util.Calendar timestamp = new java.util.GregorianCalendar (2016,
                 2,
                 3,
                 4,
                 5,
                 6);
		f.setTimestamp(timestamp);
		try{
		f.setPermission(0,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertEquals("?r--------    0                         -1 2016-03-03 04:05:06.000 GMT null", formatted);
	}

	@Test(timeout = 4000)
	public void test_31_504() throws Throwable {
		FTPFile f = new FTPFile();
		java.util.Calendar timestamp = new java.util.GregorianCalendar (2016,
                 7,
                 3,
                 4,
                 5,
                 6);
		f.setName("jose");
		f.setTimestamp(timestamp);
		try{
		f.setPermission(0,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString("Returns a string representation of the FTPFile information.");
		assertEquals("?r--------    0                         -1 2016-08-03 03:05:06.000 GMT jose", formatted);
	}

	@Test(timeout = 4000)
	public void test_32_508() throws Throwable {
		FTPFile f = new FTPFile();
		java.util.Calendar timestamp = new java.util.GregorianCalendar (2016,
                 7,
                 3,
                 4,
                 5,
                 6);
		f.setName("jose");
		f.setTimestamp(timestamp);
		try{
		f.setPermission(1,0,true);
		}catch(NullPointerException npe){}
		String formatted = f.toFormattedString();
		assertEquals("?---r-----    0                         -1 2016-08-03 04:05:06 BST jose", formatted);
	}

	@Test(timeout = 4000)
	public void test_33_510() throws Throwable {
		String rawVal = "blue monkey";
		FTPFile f = new FTPFile(rawVal);
		String raw = f.toString();		
		assertEquals(rawVal, raw);
	}

  	public void set34(FTPFile f){
	  	f.setType(FTPFile.FILE_TYPE);
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}
  
	@Test(timeout = 4000)
	public void test_34_511() throws Throwable {
		FTPFile f = new FTPFile();
		set34(f);
		String expected = "---x-w-r--    2 TEST USER TEST GROUP       -1 null";
		assertEquals(expected, f.toFormattedString());
	}
  
  	
	public void set35(FTPFile f) {f.setType(FTPFile.DIRECTORY_TYPE);
		java.util.Calendar timestamp = new java.util.GregorianCalendar (2016,
                 7,
                 3,
                 4,
                 5,
                 6);
		f.setName("jose");
		f.setTimestamp(timestamp);
		f.setPermission(2,2,true);}
	@Test(timeout = 4000)
	public void test_35_536() throws Throwable {
		FTPFile f = new FTPFile();
		set35(f);
		String formatted = f.toFormattedString();
		assertEquals("d--------x    0                         -1 2016-08-03 04:05:06 BST jose", formatted);
	}

  	public void set36(FTPFile f){f.setType(FTPFile.DIRECTORY_TYPE);
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}
	@Test(timeout = 4000)
	public void test_36_541() throws Throwable {
		FTPFile f = new FTPFile();
		set36(f);
		String expected = "d--x-w-r--    2 TEST USER TEST GROUP       -1 null";
		assertEquals(expected, f.toFormattedString());
	}

  
  	public void set37(FTPFile f){		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		java.util.Calendar timestamp = new java.util.GregorianCalendar (2016,
                 7,
                 3,
                 4,
                 5,
                 6);
		f.setName("jose");
		f.setTimestamp(timestamp);
		f.setPermission(2,2,true);}
	@Test(timeout = 4000)
	public void test_37_546() throws Throwable {
		FTPFile f = new FTPFile();
		set37(f);
		String formatted = f.toFormattedString();
		assertEquals("l--------x    0                         -1 2016-08-03 04:05:06 BST jose", formatted);
	}
  
  	public void set38(FTPFile f){		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}

	@Test(timeout = 4000)
	public void test_38_547() throws Throwable {
		FTPFile f = new FTPFile();
		set38(f);
		String expected = "l--x-w-r--    2 TEST USER TEST GROUP       -1 null";
		assertEquals(expected, f.toFormattedString());
	}

  	public void set39(FTPFile f){		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}
	@Test(timeout = 4000)
	public void test_39_548() throws Throwable {
		FTPFile f = new FTPFile();
		set39(f);
		String expected = "?--x-w-r--    2 TEST USER TEST GROUP       -1 null";
		assertEquals(expected, f.toFormattedString());
	}

	@Test(timeout = 4000)
	public void test_40_549() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		assertTrue("first_valid", f.isValid());
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertTrue("second valid", f.isValid());
	}

	@Test(timeout = 4000)
	public void test_41_550() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		assertTrue("isSymbolicLink 1", f.isSymbolicLink());
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertFalse("isNotSymbolicLink 1", f.isSymbolicLink());
	}

  	public void set42(FTPFile f){		f.setSize(200);
		f.setType(FTPFile.FILE_TYPE);
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}
	@Test(timeout = 4000)
	public void test_42_552() throws Throwable {
		FTPFile f = new FTPFile();
		set42(f);
		String expected = "---x-w-r--    2 TEST USER TEST GROUP      200 null";
		assertEquals(expected, f.toFormattedString());
	}

	@Test(timeout = 4000)
	public void test_43_553() throws Throwable {
		FTPFile f = new FTPFile();
		assertTrue("isUnknown",f.isUnknown());
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertFalse("isNotUnknown", f.isUnknown());
	}

	@Test(timeout = 4000)
	public void test_44_554() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse("isNotFile", f.isFile());
		f.setType(FTPFile.FILE_TYPE);
		assertTrue("isFile", f.isFile());
	}

  
  	public void set45(FTPFile f){		f.setType(FTPFile.FILE_TYPE);
		f.setPermission(FTPFile.USER_ACCESS, FTPFile.EXECUTE_PERMISSION, true);
		f.setPermission(FTPFile.WORLD_ACCESS, FTPFile.READ_PERMISSION, true);
		f.setPermission(FTPFile.GROUP_ACCESS, FTPFile.WRITE_PERMISSION, true);
		f.setHardLinkCount(2);
		f.setUser("TEST USER");
		f.setGroup("TEST GROUP");}
	@Test(timeout = 4000)
	public void test_45_558() throws Throwable {
		FTPFile f = new FTPFile();
		set45(f);
		String expected = "---x-w-r--    2 TEST USER TEST GROUP       -1 null";
		assertEquals(expected, f.toFormattedString("TEST"));
	}

	@Test(timeout = 4000)
	public void test_46_560() throws Throwable {
		FTPFile f = new FTPFile();
		assertEquals("unknown type", FTPFile.UNKNOWN_TYPE, f.getType());
		f.setType(FTPFile.FILE_TYPE);
		assertEquals("file type", FTPFile.FILE_TYPE, f.getType());
	}

	@Test(timeout = 4000)
	public void test_47_561() throws Throwable {
		FTPFile f = new FTPFile();
		assertTrue("isValid", f.isValid());
		f = new FTPFile("");
		assertFalse("isNotValid", f.isValid());
	}

	@Test(timeout = 4000)
	public void test_48_562() throws Throwable {
		FTPFile f = new FTPFile("TEST STRING");
		assertFalse("isValid", f.isValid());
		assertFalse("hasPermission", f.hasPermission(0,0));
	}

	@Test(timeout = 4000)
	public void test_49_566() throws Throwable {
		FTPFile f = new FTPFile();
		f.setRawListing("__hello__");
		assertEquals("__hello__", f.getRawListing());
	}

	@Test(timeout = 4000)
	public void test_50_567() throws Throwable {
		FTPFile f = new FTPFile();
		assertFalse(f.isFile());
	}

	@Test(timeout = 4000)
	public void test_51_569() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.FILE_TYPE);
		assertTrue(f.isFile());
	}

	@Test(timeout = 4000)
	public void test_52_570() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertFalse(f.isFile());
	}

	@Test(timeout = 4000)
	public void test_53_571() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.SYMBOLIC_LINK_TYPE);
		assertFalse(f.isFile());
	}

	@Test(timeout = 4000)
	public void test_54_572() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(-1);
		assertFalse(f.isFile());
	}

	@Test(timeout = 4000)
	public void test_55_573() throws Throwable {
		FTPFile f = new FTPFile();
		f.setHardLinkCount(0);
	  	int hardLink = 0;
		assertEquals("0", hardLink, f.getHardLinkCount());
		f.setHardLinkCount(Integer.MAX_VALUE);
	  	hardLink = Integer.MAX_VALUE;
		assertEquals("max_value", hardLink, f.getHardLinkCount());
	}

	@Test(timeout = 4000)
	public void test_56_574() throws Throwable {
		FTPFile ftp = new FTPFile();
		ftp.setHardLinkCount(2);
		ftp.setType(FTPFile.FILE_TYPE);
		assertTrue(ftp.isFile());
	}

	@Test(timeout = 4000)
	public void test_57_627() throws Throwable {
		FTPFile f = new FTPFile("");
		assertFalse("r", f.hasPermission(FTPFile.USER_ACCESS, FTPFile.READ_PERMISSION));
		assertFalse("w", f.hasPermission(FTPFile.WORLD_ACCESS, FTPFile.WRITE_PERMISSION));
	}

	@Test(timeout = 4000)
	public void test_58_631() throws Throwable {
		FTPFile f = new FTPFile();
		assertEquals("unknown type", FTPFile.UNKNOWN_TYPE, f.getType());
		f.setType(FTPFile.DIRECTORY_TYPE);
		
		assertEquals("directory type", FTPFile.DIRECTORY_TYPE, f.getType());
	}

	@Test(timeout = 4000)
	public void test_59_632() throws Throwable {
		
		String rawVal = null;
		FTPFile f = new FTPFile(rawVal);
		String raw = f.getRawListing();		
		assertEquals(rawVal, raw);
	}

	@Test(timeout = 4000)
	public void test_60_633() throws Throwable {
		FTPFile ftp = new FTPFile();
		ftp.setType(1);
	  	int type = 1;
		assertEquals(type, ftp.getType());
	}

	@Test(timeout = 4000)
	public void test_61_638() throws Throwable {
		FTPFile f = new FTPFile();
		assertNull("null", stringer(f));
		f = new FTPFile("__hello__");
		assertEquals("hello", "__hello__", stringer(f));
	}
  
  public String stringer(FTPFile f){ return f.toString();}

	@Test(timeout = 4000)
	public void test_62_639() throws Throwable {
		FTPFile f = new FTPFile();
		assertNull("null", f.getLink());
		f.setLink("www.google.com");
		assertEquals("google", "www.google.com", f.getLink());
	}

	@Test(timeout = 4000)
	public void test_63_644() throws Throwable {
		FTPFile ftp = new FTPFile("test");
		ftp.setType(2);
		assertFalse(ftp.hasPermission(0,0));
	}

	@Test(timeout = 4000)
	public void test_64_646() throws Throwable {
		FTPFile ftp = new FTPFile();
		
		java.util.Calendar c = new java.util.GregorianCalendar(2016,8,5);
		ftp.setTimestamp(c);
		assertTrue("isSet 1", c.isSet(java.util.Calendar.YEAR));
		ftp.toFormattedString();
		assertTrue("isSet 2", c.isSet(java.util.Calendar.YEAR));
	}
  
  	

	@Test(timeout = 4000)
	public void test_65_647() throws Throwable {
	  	int type = 2;
		assertEquals("symbolic_link_type is int", int.class,FTPFile.class.getField("SYMBOLIC_LINK_TYPE").getType());
		assertEquals("symbolic_link is 2", type, FTPFile.SYMBOLIC_LINK_TYPE);
	}

	@Test(timeout = 4000)
	public void test_66_648() throws Throwable {
		FTPFile f = new FTPFile();
		f.setType(FTPFile.DIRECTORY_TYPE);
		assertTrue("isDirectory", f.isDirectory());
		//f.setType(0);
		//boolean isDir = f.isDirectory();
		//f.setType(2);
		//assertTrue("isNotDirectory", !isDir && !f.isDirectory());
	}

}

