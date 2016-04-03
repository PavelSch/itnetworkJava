package oopMyTest01.referencniTypy;

public class ReferencniTypy {

	public static void main(String[] args) {

		// zalo�en� prom�nn�ch
		int a = 56;
		int b = 28;
		Uzivatel u = new Uzivatel("Jan Nov�k", 28);
		Uzivatel v = new Uzivatel("Josef Nov�", 32);
		System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n", a, b, u, v);
		// p�i�azov�n�
		a = b;
		u = v;
		System.out.printf("a: %s\nb: %s\nu: %s\nv: %s\n", a, b, u, v);
		
		// zm�na
		v.jmeno = "John Doe";
		System.out.printf("u: %s\nv: %s\n", u, v);
		
		// zm�na
		// v.jmeno = "John Doe";
		// v = null;

	}

}



class Uzivatel
{
        public int vek;
        public String jmeno;

        public Uzivatel(String jmeno, int vek)
        {
                this.jmeno = jmeno;
                this.vek = vek;
        }

        @Override
        public String toString()
        {
                return jmeno;
        }
}