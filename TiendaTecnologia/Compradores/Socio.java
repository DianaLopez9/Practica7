package TiendaTecnologia.Compradores;

public class Socio extends Comprador{

    private int idEstudiante;
    private ArrayList<DispElect> menu;
    

    public Socio(String nombre, String apellido) {
        super(nombre, apellido);
        this.menu = new ArrayList<>();
    }
    
    public void setIdEstidiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void crearMenu(){
        Smarthphone smartphone1 = new Smarthphone(17999.0, "11 5G", "Oneplus", "120 Hz 2K Super Fluid AMOLED", "Oxygen OS, Android 13.0", 5, 30, "22x5");
        Smarthphone smartphone2 = new Smarthphone(18310.0, "POCO F5", "Xiaomi", "AMOLED Dotdisplay", "Android 13.0", 6, 35, "22x6");
        Smarthphone smartphone3 = new Smarthphone(21900.0, "A 5P", "Nothing", "OLED Toughness", "Android 11.0", 8, 40, "20x5");

        
        Pc pc1 = new Pc(29000.0, "ThinkCentre M910s SFF", "Lenovo", "FHD de 23 pulgadas", 4, "Windows 10 Pro", "1 TB", "P8 H61", "778G");
        Pc pc2 = new Pc(25700.0, "HP Elite", "HP", "Full HD de 22 pulgadas", 8, "Windows 10 Pro", "2 TB", "64S7", "65 P");
        Pc pc3 = new Pc(50000.0, "iMac", "Apple", "21,5 Pulgadas", 16, "DOS", "2 TB", "P9 H", "3745 B");

        
        Laptop laptop1 = new Laptop(49500.0, "Apple MacBook Pro Chip", "Apple", "13 pulgadas", 8, "macOS 10.14 Mojave", "2TB", "SD", "Integrada",64);
        Laptop laptop2 = new Laptop(30999.0, "MacBook Air", "Apple", "15 pulgadas", 16, "Mac OS", "2TB", "SD", "Integrada",24);
        Laptop laptop3 = new Laptop(43500.0, "MacBook Air", "Apple", "13 Pulgadas", 32, "Mac OS", "2TB", "SD", "Integrada",12);


        menu.add(pc1);
        menu.add(pc2);
        menu.add(pc3);
        menu.add(smartphone1);
        menu.add(smartphone2);
        menu.add(smartphone3);
        menu.add(laptop1);
        menu.add(laptop2);
        menu.add(laptop3);
    }

    public void mostrarMenu(){
        
        System.out.println("Estos son los productos que tenemos para usted:");
        System.out.print("\n");
        int index=0;
        for(DispElect check : menu){
            index++;
            System.out.println("Indice: "+index);
            check.mostrarDatos();
            System.out.println("\n");
        }
    }

    public void comprar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que producto le gustaria comprar?");
        int chose = sc.nextInt();
        sc.nextLine();
        System.out.println(chose);
        int limit = menu.size();
        System.out.println(limit);
        if(0<=chose && chose<limit){
        int chose2 = chose-1;
        miCarrito.agregarAlCarrito(menu.get(chose2));
        System.out.println("Producto agregado al carrito");
        }
        else{
            System.out.println("Por favor, escoja una opcion disponible");
            System.exit(0);
        }
    }

    public void ticket(){
         double total = 0;
         System.out.println("Elementos agregados al carrito:");
         for (DispElect dispositivo : miCarrito.dispositivos){
            System.out. print("\n");
            dispositivo.mostrarDatos(); 
            total += dispositivo.getPrecio(); 
         }
         System.out.println("Total del carrito de compras: " + total);
     }

    public void mostrarDescuentos(){
    
       System.out.println("Ofertas disponibles:");
       System.out.println("1 - En la compra de una Laptop y un smartphone, el segundo sale a mitad de precio");
       System.out.println("2 - En la compra de una PC y un Smartphone, el segundo es gratis");
       
       Scanner sc2 = new Scanner(System.in);
       
       int chose2 = sc2.nextInt();
        switch(chose2){
               case 1:
                    miCarrito.agregarAlCarrito(menu.get(7));
                    DispElect telefono = menu.get(4);
                    double newPrice = (telefono.getPrecio()/2);
                    telefono.setPrecio(newPrice);
                    miCarrito.agregarAlCarrito(telefono);
                    System.out.println("Articulos ya han sido agregados");
                    break;
                   
                case 2:
                    miCarrito.agregarAlCarrito(menu.get(2));
                    DispElect telefono2 = menu.get(3);
                    telefono2.setPrecio(0);
                    miCarrito.agregarAlCarrito(telefono2);
                    System.out.println("Articulos ya han sido agregados");
                    break;
                default:
                    System.out.println("Utilice las opciones disponibles, por favor");
           }
    }
}
