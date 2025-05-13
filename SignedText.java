public class SignedText {
    private String fn;
    private String ln;

    public SignedText(String fn, String ln) {
        this.fn = fn;
        this.ln = ln;
    }

    public String getSignature() {
        if (fn.length() == 0) {
            return ln;
        } else {
            return fn.substring(0, 1) + "-" + ln;
        }
    }

    public String addSignature(String text) {
        String signature = getSignature();

        if (!text.contains(signature)) {
            return text + signature;
        } else if(text.contains(signature) && (text.indexOf(signature) != 0)) {
            return text;
        } else {
            return text.substring(signature.length()) + signature;
        }
    }

    public static void main(String[] args) {
        SignedText st1 = new SignedText("", "Wong");
        String temp = st1.getSignature();
        System.out.println(temp);

        SignedText st2 = new SignedText("henry", "dubois");
        temp = st2.getSignature();
        System.out.println(temp);

        SignedText st3 = new SignedText("GRACE", "LOPEZ");
        temp = st3.getSignature();
        System.out.println(temp);

        SignedText st4 = new SignedText("", "FOX");
        temp = st4.addSignature("Dear");
        System.out.println(temp);

        SignedText st5 = new SignedText("", "FOX");
        temp = st5.addSignature("Best wishesFOX");
        System.out.println(temp);

        SignedText st6 = new SignedText("", "FOX");
        temp = st6.addSignature("FOXThanks");
        System.out.println(temp);

        SignedText st7 = new SignedText("GRACE", "LOPEZ");
        temp = st7.addSignature("G-LOPEZHELLO");
        System.out.println(temp);
    }   
}