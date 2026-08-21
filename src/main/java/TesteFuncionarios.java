public class TesteFuncionarios {
    public static void main(String[] args) {
    	
        Funcionario f = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");
        
        FuncionarioCLT clt = new FuncionarioCLT("Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);
        
        Gerente gerente = new Gerente("Carla Mendes", "G001", 8000.0, "15/01/2018", 300.0, 500.0, 12, 0.20);
        
        Estagiario estagiario = new Estagiario("Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        Diretor diretor = new Diretor("Eduardo Silva", "D001", 10000.0, "10/10/2015", 300.0, 500.0, 15, 0.30, 5000.0);

        System.out.println("--- FUNCIONÁRIO ---");
        System.out.println(f);
        
        System.out.println("\n--- FUNCIONÁRIO CLT ---");
        System.out.println(clt);
        
        System.out.println("\n--- GERENTE ---");
        System.out.println(gerente);
        
        System.out.println("\n--- ESTAGIÁRIO ---");
        System.out.println(estagiario);
        
        System.out.println("\n--- DIRETOR (DESAFIO) ---");
        System.out.println(diretor);
    }
}