package controllStatements;
public class  SwichCase{
public static void main(String[] args){
    String name="amo";
    System.out.println(name);
    switch (name) {
        case "amo":
        System.out.println(" chan est mea " + name);
            
            break;
            case "Edd":
            System.out.println(" Edd est non mea " + name);
    
        default:
        System.out.println("Unknown person so let me know him or her!");
            break;
    }

}
}