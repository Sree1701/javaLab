class CPU{
        int price;
        CPU(int price){
                this.price=price;
        }

        class Processor{
                int cores;
                String manufacturer;

                Processor(int cores, String manufacturer){
                this.cores=cores;
                this.manufacturer = manufacturer;
                }
                void displayProcessor(){
                System.out.println("Processor Manufacturer:"+manufacturer);
                }

        }
        static class RAM{
                int memory;
                String manufacturer;
                RAM(int memory, String manufacturer){
                        this.memory=memory;
                        this.manufacturer=manufacturer;
                }
                void displayRAM(){
                        System.out.println("RAM Memory: "+memory+" GB");
                        System.out.println("RAM Manufacturer: "+manufacturer);
                }
        }
}

public class Program9{
        public static void main(String args[]){
                CPU cpu = new CPU(50000);
                System.out.println("CPU Price: " + cpu.price);

                CPU.Processor processor = cpu.new Processor(0,"Intel");
                processor.displayProcessor();
                CPU.RAM ram = new CPU.RAM(16,"Samsung");
                ram.displayRAM();
        }
}
