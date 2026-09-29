public class Utils {

    public static int writeInt(byte[] memory, int offset, int value) {
        memory[offset] = (byte)(value&0xFF);
		memory[offset + 1] = (byte)(value>>8&0xFF);
		memory[offset + 2] = (byte)(value>>16&0xFF);
		memory[offset + 3] = (byte)(value>>24&0xFF);
        return 4;
    }

    public static int readInt(byte[] memory, int offset) {
		int tempValue;
        tempValue = (int)memory[offset];
		tempValue |= (int)memory[offset + 1]<<8;
		tempValue |= (int)memory[offset + 2]<<16;
		tempValue |= (int)memory[offset + 3]<<24;
        return tempValue;
    }

    public static int writeShort(byte[] memory, int offset, short value) {
        memory[offset] = (byte)(value&0xFF);
		memory[offset + 1] = (byte)(value>>8&0xFF);
        return 2;
    }

    public static short readShort(byte[] memory, int offset) {
        short tempValue;
        tempValue = (short)memory[offset];
		tempValue |= (short)memory[offset + 1]<<8;
        return tempValue;
    }
	public static int writeLong(byte[] memory, int offset, long value) {
		memory[offset] = (byte)(value&0xFF);
		memory[offset + 1] = (byte)(value>>8&0xFF);
		memory[offset + 2] = (byte)(value>>16&0xFF);
		memory[offset + 3] = (byte)(value>>24&0xFF);
		memory[offset + 4] = (byte)(value>>32&0xFF);
		memory[offset + 5] = (byte)(value>>40&0xFF);
		memory[offset + 6] = (byte)(value>>48&0xFF);
		memory[offset + 7] = (byte)(value>>56&0xFF);
    return 8;
	}

	public static long readLong(byte[] memory, int offset) {
		long tempValue;
        tempValue = (long)memory[offset];
		tempValue |= (long)memory[offset + 1]<<8;
		tempValue |= (long)memory[offset + 2]<<16;
		tempValue |= (long)memory[offset + 3]<<24;
		tempValue |= (long)memory[offset + 4]<<32;
		tempValue |= (long)memory[offset + 5]<<40;
		tempValue |= (long)memory[offset + 6]<<48;
		tempValue |= (long)memory[offset + 7]<<56;
        return tempValue;
	}

	public static int writeString(
			byte[] memory,
			int offset,
			String str,
			int maxLength) {

		int parcours = 0;
		byte[] tableByte = str.getBytes();
		while (parcours <= maxLength) {
			if (parcours<str.length){
				memory[offset + parcours] = tableByte[parcours];
				parcours ++;
			} else {
				memory[offset + parcours] = 00;
				parcours ++;
			}
		}
		return maxLength;
	}

	public static String readString(
			byte[] memory,
			int offset,
			int maxLength) {

		return String(memory,offset,maxLength);
	}
}