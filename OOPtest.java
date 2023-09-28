import java.util.ArrayList;

class main{
    public static void main(String[] args) {

        Project tomProject1 = new Project("Web A", "Developing a web application.");
        Project tomProject2 = new Project("Mobile app A", "Developing a moblie app.");
        ArrayList<Project> tommyProjects = new ArrayList<>();
        tommyProjects.add(tomProject1);
        tommyProjects.add(tomProject2);
        Employee tommy =  new Employee("Tom", 25.02, "UX/UI", "0001", tommyProjects);

        Project timProject1 = new Project("Web A", "Developing a web application.");
        ArrayList<Project> timmyProjects = new ArrayList<>();
        timmyProjects.add(timProject1);
        Employee timmy = new Employee("Tim", 50.11, "Front/End", "0002", timmyProjects);

        

        tommy.ShowDetails();
        timmy.ShowDetails();
    }
}

class Project{
    public String ProjectName;
    public String Description;
    
    public Project(String newProjectName, String newDescription){
        this.ProjectName = newProjectName;
        this.Description = newDescription;
    }

    public String getName(){
        return ProjectName;
    }
    public String getDesc(){
        return Description;
    }
}

interface Person{
    void getName();
    void setName();
    void getAge();
    void setAge();

}

interface Job{
    void getPosition();
    void setPosition();
    void getEmpID();
    void setEmpID();
}

class Employee implements Person, Job{
    protected String Name;
    protected double Age;
    protected String Position;
    protected String EmpID;
    protected ArrayList<Project> MyProject;

    protected Employee(String newName,double newAge,String newPosition,String newID,ArrayList<Project> newProjects){
        this.Name = newName;
        this.Age = newAge;
        this.Position = newPosition;
        this.EmpID = newID;
        this.MyProject = newProjects;
    }

    void AddProject(Project newProject){
        MyProject.add(newProject);
    }

    void getName(String currentName){
        this.Name = currentName;
    }
    void setName(String newName){
        this.Name = newName;
    }
    void getAge(int currentAge){
        this.Age = currentAge;
    }
    void setAge(int newAge){
        this.Age = newAge;
    }

    void getPosition(String currentPosition){
        this.Position = currentPosition;
    }
    void setPosition(String newPosition){
        this.Position = newPosition;
    }
    void getEmpID(String currentID){
        this.EmpID = currentID;
    }
    void setEmpID(String newID){
        this.EmpID = newID;
    }




    void ShowDetails(){
        System.out.println("*************");
        System.out.println("Name : "+this.Name);
        System.out.println("Position : "+this.Position);
        System.out.println("EmpID : "+this.EmpID);
        System.out.println("Projects");
        
        for (Project project: MyProject){
            System.out.println("     "+project.ProjectName+" : "+project.Description);
        }
    }
    


}