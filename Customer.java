package LawnCareCompany;

public Customer{
    //Instance variables
        private String name;
        private String address;
        private int lotSize;
    private Employee myContact;
    
        public  Customer(String name, String address, int lotSize){
                this.name=name;
                this.address=address;
                this.lotSize=lotSize;

        }
        public getName(){
                return name;

        }

        public getaddress(){
                return address;

        }

        }
