public class Calcul {
    private String[] tok;
    private int posit;
    public Calcul() {
    }
    public void analiz(String yravn) {
        this.tok = yravn.split(" ");
        this.posit = 0;
    }
    public double calc() {
        double fr = this.milt();
        while(this.posit < this.tok.length) {
            String operator = this.tok[this.posit];
            if (!operator.equals("+") && !operator.equals("-")) {
                break;
            }
            ++this.posit;
            double sec = this.milt();
            if (operator.equals("+")) {
                fr += sec;
            } else {
                fr -= sec;
            }
        }
        return fr;
    }
    private double milt() {
        double fr = this.fc();
        while(this.posit < this.tok.length) {
            String operator = this.tok[this.posit];
            if (!operator.equals("*") && !operator.equals("/") && !operator.contains("%") && !operator.equals("^") && !operator.equals("//")) {
                break;
            }
            ++this.posit;
            double sec = this.fc();
            if (operator.equals("*")) {
                fr *= sec;
            }
            if (operator.equals("%")) {
                fr %= sec;
            }
            if (operator.equals("/")) {
                fr /= sec;
            }
            if (operator.equals("^")) {
                if (sec == 1.0) {
                    return fr;
                }
                return fr * Math.pow(fr, sec - 1.0);
            }
            if (operator.equals("//")) {
                if (fr > 0.0 && sec > 0.0) {
                    fr = Math.floor(fr / sec);
                    return fr;
                }
                if (fr < 0.0 && sec < 0.0) {
                    fr = Math.floor(fr / sec);
                    return fr;
                }
                if (fr > 0.0 && sec < 0.0) {
                    fr = Math.ceil(fr / sec);
                    return fr;
                }
                if (fr < 0.0 && sec > 0.0) {
                    fr = Math.ceil(fr / sec);
                    return fr;
                }
            }
        }
        return fr;
    }
    private double fc() {
        String next = this.tok[this.posit];
        double result;
        String closBracket;
        if (next.equals("(")) {
            ++this.posit;
            result = this.calc();
            if (this.posit >= this.tok.length) {
                throw new IllegalArgumentException("Ne naydeno ')'");
            }
        }
        if (next.equals("[")) {
            ++this.posit;
            result = this.calc();
            if (this.posit >= this.tok.length) {
                throw new IllegalArgumentException("Ne naydeno ']'");
            }
        }
        ++this.posit;
        return Double.parseDouble(next);
    }
}

