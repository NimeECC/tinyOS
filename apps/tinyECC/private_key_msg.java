/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'private_key_msg'
 * message type.
 */

public class private_key_msg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 26;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 12;

    /** Create a new private_key_msg of size 26. */
    public private_key_msg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new private_key_msg of the given data_length. */
    public private_key_msg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg with the given data_length
     * and base offset.
     */
    public private_key_msg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg using the given byte array
     * as backing store.
     */
    public private_key_msg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg using the given byte array
     * as backing store, with the given base offset.
     */
    public private_key_msg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public private_key_msg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg embedded in the given message
     * at the given base offset.
     */
    public private_key_msg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new private_key_msg embedded in the given message
     * at the given base offset and length.
     */
    public private_key_msg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <private_key_msg> \n";
      try {
        s += "  [len=0x"+Long.toHexString(get_len())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [d=";
        for (int i = 0; i < 24; i++) {
          s += "0x"+Long.toHexString(getElement_d(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: len
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'len' is signed (false).
     */
    public static boolean isSigned_len() {
        return false;
    }

    /**
     * Return whether the field 'len' is an array (false).
     */
    public static boolean isArray_len() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'len'
     */
    public static int offset_len() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'len'
     */
    public static int offsetBits_len() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'len'
     */
    public short get_len() {
        return (short)getUIntElement(offsetBits_len(), 8);
    }

    /**
     * Set the value of the field 'len'
     */
    public void set_len(short value) {
        setUIntElement(offsetBits_len(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'len'
     */
    public static int size_len() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'len'
     */
    public static int sizeBits_len() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: d
    //   Field type: short[], unsigned
    //   Offset (bits): 8
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'd' is signed (false).
     */
    public static boolean isSigned_d() {
        return false;
    }

    /**
     * Return whether the field 'd' is an array (true).
     */
    public static boolean isArray_d() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'd'
     */
    public static int offset_d(int index1) {
        int offset = 8;
        if (index1 < 0 || index1 >= 24) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'd'
     */
    public static int offsetBits_d(int index1) {
        int offset = 8;
        if (index1 < 0 || index1 >= 24) throw new ArrayIndexOutOfBoundsException();
        offset += 0 + index1 * 8;
        return offset;
    }

    /**
     * Return the entire array 'd' as a short[]
     */
    public short[] get_d() {
        short[] tmp = new short[24];
        for (int index0 = 0; index0 < numElements_d(0); index0++) {
            tmp[index0] = getElement_d(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'd' from the given short[]
     */
    public void set_d(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_d(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'd'
     */
    public short getElement_d(int index1) {
        return (short)getUIntElement(offsetBits_d(index1), 8);
    }

    /**
     * Set an element of the array 'd'
     */
    public void setElement_d(int index1, short value) {
        setUIntElement(offsetBits_d(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'd'
     */
    public static int totalSize_d() {
        return (192 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'd'
     */
    public static int totalSizeBits_d() {
        return 192;
    }

    /**
     * Return the size, in bytes, of each element of the array 'd'
     */
    public static int elementSize_d() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'd'
     */
    public static int elementSizeBits_d() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'd'
     */
    public static int numDimensions_d() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'd'
     */
    public static int numElements_d() {
        return 24;
    }

    /**
     * Return the number of elements in the array 'd'
     * for the given dimension.
     */
    public static int numElements_d(int dimension) {
      int array_dims[] = { 24,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'd' with a String
     */
    public void setString_d(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_d(i, (short)s.charAt(i));
         }
         setElement_d(i, (short)0); //null terminate
    }

    /**
     * Read the array 'd' as a String
     */
    public String getString_d() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,24)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_d(i) == (char)0) break;
             carr[i] = (char)getElement_d(i);
         }
         return new String(carr,0,i);
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: short, unsigned
    //   Offset (bits): 200
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (200 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 200;
    }

    /**
     * Return the value (as a short) of the field 'id'
     */
    public short get_id() {
        return (short)getUIntElement(offsetBits_id(), 8);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(short value) {
        setUIntElement(offsetBits_id(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 8;
    }

}