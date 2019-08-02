package entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ByteObjectItemUtil {
	@SuppressWarnings("finally")
	public static byte[] ObjectToByteArray(Item item) {
		byte []data = null;
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
		    ObjectOutputStream oos = new ObjectOutputStream(bos);
		    oos.writeObject(item);
		    oos.flush();
		    data = bos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return data;
		}
	}	
	
	public static Item byteArrayToObject(byte[] bytes) {
		ObjectInputStream objStream = null;
		try {
			ByteArrayInputStream byteStream = new ByteArrayInputStream(bytes);
		    objStream = new ObjectInputStream(byteStream);	
		    return (Item)objStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
