public class Text1 {
    public void main(String[] args) {
        for (int i = 2023; ; i++) {
            A a = new A();
            boolean t = a.check(i);
            if (t) {
                System.out.println(i);
                break;
            }
        }
    }

    class A {
        public boolean check(int i) {
            String s = Integer.toBinaryString(i);
            for (int j = s.length() - 1; i >= s.length() - 6; j--) {
                if (s.charAt(j) != '0')
                    return false;
            }
            return true;
        }
    }
}
