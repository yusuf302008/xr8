package TUGAS;

    public class Teacher extends person {
        protected String subject;
    
        public String getSubject() {
            return this.subject;
        }
    
        public void setSubject(String subject) {
            this.subject = subject;
        }
    
        public Teacher(){
            super();
            subject = "";
        }
    
        public Teacher(String name, int age, String subject){
            super(name, age);
            this.subject = subject;
        }
    
        public void print(){
            super.print();
            System.out.println("subjek: " + subject);
        }
    
    
        
    }
