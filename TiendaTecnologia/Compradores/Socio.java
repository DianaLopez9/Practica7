package TiendaTecnologia.Compradores;

public class Socio extends Comprador{

    private int idSocio;
    private ArrayList<DispElect> menu;
    

    public Socio(String nombre, String apellido) {
        super(nombre, apellido);
        this.menu = new ArrayList<>();
    }
    
    public void setSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void crearMenu(){
        Smarthphone smartphone1 = new Smarthphone(17999.0, "11 5G", "Oneplus", "120 Hz 2K Super Fluid AMOLED", "Oxygen OS, Android 13.0", 5, 30, "22x5");
        Smarthphone smartphone2 = new Smarthphone(18310.0, "POCO F5", "Xiaomi", "AMOLED Dotdisplay", "Android 13.0", 6, 35, "22x6");
        
        Pc pc1 = new Pc(25700.0, "HP Elite", "HP", "Full HD de 22 pulgadas", 8, "Windows 10 Pro", "2 TB", "64S7", "65 P");
        
        Laptop laptop1 = new Laptop(30999.0, "MacBook Air", "Apple", "15 pulgadas", 16, "Mac OS", "2TB", "SD", "Integrada",24);
        Laptop laptop2 = new Laptop(43500.0, "MacBook Air", "Apple", "13 Pulgadas", 32, "Mac OS", "2TB", "SD", "Integrada",12);

        Tablet tab1 = new Tablet(4000.0, "Stylus1", "Samsumg", "Sam Pro", "10.5 Pulgadas", "Android", 4, 21000, "Samsumg Redonda de 10.5");
        Tablet tab2 = new Tablet(5000.0, "Stylus2", "Huawey", "MatePad 11.5 PaperMatte", "11.5 Pulgadas", "Harmony OS 3.1", 8, 19000, "HUAWEI FullView de 11.5");
        
        Television tv1 = new Television(9500.0, "Mod453", "Weyon", "60 Pulgadas", "2 años");
        Television tv2 = new Television(10100.0, "Mod574", "Sansui", "80 Pulgadas", "3 años");

        menu.add(smartphone1);
        menu.add(smartphone2);
        menu.add(pc1);
        menu.add(laptop1);
        menu.add(laptop2);
        menu.add(tab1);
        menu.add(tab2);
        menu.add(tv1);
        menu.add(tv2);
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
        
        if(0<=chose && chose<menu.size()){
        int chose2 = chose-1;
        miCarrito.agregarAlCarrito(menu.get(chose));
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
