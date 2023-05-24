interface detail {
    public void abc(String name, int rank);

    public void xyz(String address);
}

class student implements detail {
    public void abc(String name, int rank) {
        System.out.println("the name and rank is:");

        System.out.println("Name=" + name + "\nRank" + rank);

    }

    public void xyz(String address) {
        System.out.println("The adress is:" + address);
    }

}

public class interfacequestion {
    public static void main(String args[])

    {
        
        student sg[] = new student[2];
        for(int j=0;j<2;j++)
        {
            sg[j]=new student();
        }
        sg[0].abc("prerna", 3);
        sg[0].xyz("Jeetpur");
sg[1].abc("Pragati",4);
sg[1].xyz("Simara");
    }
    }