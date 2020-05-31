//a byte is a sequence of 0's and 1's.  It's 8-bits
//a byte can be converted to a char which is the same size
//a char can be cast to a byte which is the same size
//when you take a char and caste it to a byte, it returns a small integer < 100

import java.util.Arrays;

//a char is a primitive data type of a 16-bit unicode character.  \u0000 - \uffff
//an ASCII character is a special type of char that is only 8-bit.  It's the same size as a byte
class AsciiCharSequence implements java.lang.CharSequence {
    // implementation
    public byte[] byteArr;

    public AsciiCharSequence(byte[] byteArr) {
        this.byteArr = byteArr.clone();
    }

    @Override
    public int length() {
        return byteArr.length;
    }

    //converting a byteArr to a string and getting the char is inefficient
    //It's more efficient to gather the byte at the specified index and cast only that 1 byte to char
    @Override
    public char charAt(int i) {
//        return byteArr.toString().charAt(i);
        return (char) byteArr[i];
    }

    //converting the entire byteArr to a String is inefficient
    //it's better to convert only what is needed in the array to a string
    //we want to copy the array due to reference type.  So we don't want to modify the original array
    //we have to convert the byte array to a charsequence, because this is the type we're being asked to return
    //due to our constructor, we can create a new ASCII CharSequence by providing a byte array
    //since the ASCII char sequence implements the CharSequence, they are considered the same type
    @Override
    public CharSequence subSequence(int i, int i1) {
//        return byteArr.toString().subSequence(i, i1);
        return new AsciiCharSequence(Arrays.copyOfRange(byteArr, i, i1));
    }

//Arrays.toString(byteArr) is valid code.  However the tests won't pass it
//Arrays.toString(byteArr) is the same as new String(byteArr)
    @Override
    public String toString() {
//        return java.util.Arrays.toString(byteArr);
//        return super.toString();
        return new String(byteArr);
    }
}
