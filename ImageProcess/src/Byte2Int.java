public class Byte2Int {
    public static void main(String agr0[]){
        byte b = 0x11;
        System.out.printf("%x",b);
        int i = (int)b;
        System.out.println(i);
        i = -64;
        b = (byte) i;

        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toHexString(b)+" "+(b&0xFF)+" "+Integer.toBinaryString(b&0xFF));
        String s = new String();
        s = "" + i;
        System.out.println(s+" "+s.charAt(0));
        b = (byte) 0x7F;
        i = (int)b;
        System.out.println(i+" "+Integer.toBinaryString(i));
        String s2 = "abcdefghijklmn";
        s2 = s2.substring(2,4);
        System.out.println(s2);

        /**
         * 	1. byte和int可以互相转换，甚至在作为返回值是可以将byte填入
         * 		return byte_variable
         * 	2. 如果byte的值在二进制形式下以1为开头，则转化的int前24位补1,。同理，反之补0
         * 		Byte: 0x80 1000 0000	Integer:      1111 1111 1111 1111 1111 1111 1000 0000
         * 		Byte: 0x7F 0100 0000	Integer:      0000 0000 0000 0000 0000 0000 0100 0000
         *
         * 	3. 在Java中如何以2进制，10进制，16进制打印byte或int
         * 		在Integer类下，拥有函数toBinaryString(), toHexString(), 最终以String的形式返回
         * 	4. 如何添加byte或int到String
         *      用 “+”号
         */
    }
}
