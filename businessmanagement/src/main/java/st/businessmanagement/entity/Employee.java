package st.businessmanagement.entity;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "employee")
public class Employee {

        private int id;
        private String name;
        private String position;
        private String hire_date;
        private  double salary;
        private String address;
        private String email;

        public Employee(int id, String name, String position, String hire_date, double salary, String address, String email) {
                this.id = id;
                this.name = name;
                this.position = position;
                this.hire_date = hire_date;
                this.salary = salary;
                this.address = address;
                this.email = email;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPosition() {
                return position;
        }

        public void setPosition(String position) {
                this.position = position;
        }

        public String getHire_date() {
                return hire_date;
        }

        public void setHire_date(String hire_date) {
                this.hire_date = hire_date;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }
}
