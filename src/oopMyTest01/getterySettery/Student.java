package oopMyTest01.getterySettery;

class Student
{
        private String jmeno;
        private boolean muz;
        private int vek;
        private boolean plnolety;

        public Student(String jmeno, boolean pohlavi, int vek)
        {
                this.jmeno = jmeno;
                this.muz = pohlavi;
                setVek(vek);
        }

        public String getJmeno()
        {
                return jmeno;
        }

        public void setJmeno(String jmeno) {
                this.jmeno = jmeno;
        }

        public boolean isMuz() {
                return muz;
        }

        public int getVek()
        {
                return vek;
        }

        public void setVek(int vek)
        {
                this.vek = vek;
                // p�ehodnocen� plnoletosti
                plnolety = true;
                if (vek < 18)
                        plnolety = false;
        }

        public boolean isPlnolety() {
                return plnolety;
        }

        @Override
        public String toString()
        {
                String jsemPlnolety = "jsem";
                if (!plnolety)
                        jsemPlnolety = "nejsem";
                String pohlavi = "mu�";
                if (!muz)
                        pohlavi = "�ena";
                return String.format("Jsem %s, %s. Je mi %s let a %s plnolet�.", jmeno, pohlavi, vek, jsemPlnolety);
        }


}