package Tugas_Pemrograman_lanjut_SI_B.Tugas_Bab2_Hackerrank_Dan_Modul_Bab2.Modul_Bab2_Instance_Method;

public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return (penyebut != 0);
    }

    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }

        for (int i = B; i > 0; i--) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean moreThanEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    public void negasi() {
        pembilang = -pembilang;
    }

    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void unaryMinus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void unaryTimes(Rasional A) {
        pembilang = pembilang * A.penyebut * penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void unaryDivide(Rasional A) {
        pembilang = pembilang * A.penyebut / penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}