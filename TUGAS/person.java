package TUGAS;

    public class person {
        protected String name;
        protected int age;
    
        public String getNama() {
            return this.name;
        }
    
        public void setNama(String nama) {
            this.name = nama;
        }
    
        public int getUsia() {
            return this.age;
        }
    
        public void setUsia(int usia) {
            this.age = usia;
        }
    
        public person () {
            this.name = "";
            this.age = 0;
        }
    
        public person(String name, int age){
            this.name = name;
            this.age = age;
        }
    
        public void print (){
            System.out.println("nama: " + name);
            System.out.println("usia: " + age);
        }
        
        
    }
