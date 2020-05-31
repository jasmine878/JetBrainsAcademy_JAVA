import java.util.Arrays;

class AsciiCharSequence implements java.lang.CharSequence {
    // implementation
    public byte[] byteArr;

    public AsciiCharSequence(byte[] byteArr) {
        this.byteArr = byteArr;
    }

    @Override
    public int length() {
        return byteArr.length;
    }

    @Override
    public char charAt(int i) {
//        return byteArr.toString().charAt(i);
        return (char) byteArr[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
//        return byteArr.toString().subSequence(i, i1);
        return new AsciiCharSequence(Arrays.copyOfRange(byteArr, i, i1));
    }

    @Override
    public String toString() {
//        return Arrays.toString(byteArr);
//        return super.toString();
        return new String(byteArr);
    }
}