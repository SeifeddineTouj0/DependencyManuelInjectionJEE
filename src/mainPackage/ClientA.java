package mainPackage;

public class ClientA implements Client {
	Service service;
    
	public ClientA(Service service) {
		this.service=service;
	}
	
    public void doSomething() {    
        String info = service.getInfo();
        System.out.println(info);
    }
    
    public void setService(Service service) {
        this.service = service;
    }
    
    public static void main(String args[]) {
    
    	//version 1
    	Service service = new ServiceB();
    	Client client = new ClientA(service);
    	client.doSomething();
    	
    	//version 2
    	((ClientA) client).setService(new ServiceC());
    	client.doSomething();
    }
}
