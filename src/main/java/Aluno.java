
/**
 *
 * @author DGP
 */
public class Aluno 
{
    private String nome;
    private Integer idade;
    private Double nota;
    
    //construtor com parâmetro
    public Aluno(String ctcNome,Integer ctcIdade,Double ctcNota)
    {
        this.nome = ctcNome;
        this.idade = ctcIdade;
        this.nota = ctcNota;
    }
    public String getNome() 
    {
        return nome;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public Integer getIdade() 
    {
        return idade;
    }

    public void setIdade(Integer idade) 
    {
        this.idade = idade;
    }

    public Double getNota() 
    {
        return nota;
    }

    public void setNota(Double nota) 
    {
        this.nota = nota;
    }
    
    public static void main(String[] args)
    {
        Aluno dgp = new Aluno("Daniel",31,8.9);
        System.out.println("Nome: "+dgp.getNome() +"\n "+ "Idade: "+dgp.getIdade()+"\n "+
        		"Nota: "+dgp.getNota());   
    }
}
