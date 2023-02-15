package andrijasevic.person.info;

public class Person {
        private String firstName;
        private String lastName;
        private String city;
        private String phone;

        public Person(String firstName, String lastName, String city, String phone) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.city = city;
            this.phone = phone;
        }

        public String personInfo() {
            return "You can call a citizen " + this.firstName + " " + this.lastName + " from " + this.city + " by number " + this.phone;
        }

    }




