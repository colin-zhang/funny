public class Hello {
    public native void displayHelloWorld();//����native�ؼ������εĶ��ǶԱ��ص�����
    static {
        System.loadLibrary("hello");//���뱾�ؿ�
    }
    public static void main(String[] args) {
        Hello h = new Hello();
		h.displayHelloWorld();
    }
}