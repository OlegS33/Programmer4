public class Programmer {
    String position;
    String company;
    String name;
    public Programmer (String name, String company){
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return position;
    }
    public void work(){
        if(position.equals("intern")) position = "junior";
        else if (position.equals("junior")) {    position = "middle";   }
        else if (position.equals("middle")) {    position = "senior";   }
        else if (position.equals("senior")) {    position = "lead";   }

    }
}
