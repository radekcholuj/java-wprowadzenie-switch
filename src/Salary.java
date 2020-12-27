class Salary {
    public static void main(String[] args){
        int salary = 100;

        System.out.println("Salary: "+salary);
        System.out.println();

        switch(salary){
            case 100:
                System.out.println("Podwyższone wynagrodzenie: "+(salary+1000));
                System.out.println("Procent podwyżki: "+((1000*100/salary)+"%"));
                break;
            case 2000:
                System.out.println("Podwyższone wynagrodzenie: "+(salary+200));
                System.out.println("Procent podwyżki: "+((200*100/salary)+"%"));
                break;
            case 2500:
                System.out.println("Podwyższone wynagrodzenie: "+(salary+25));
                System.out.println("Procent podwyżki: "+((25*100/salary)+"%"));
                break;
        }
    }

}
