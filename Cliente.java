
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente{
    
    private int IDCliente;
    private String NomeCliente;
    private int IdadeCliente;
    private String SexoCliente;
    private int ContatoCliente;

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public int getIdadeCliente() {
        return IdadeCliente;
    }

    public void setIdadeCliente(int IdadeCliente) {
        this.IdadeCliente = IdadeCliente;
    }

    public String getSexoCliente() {
        return SexoCliente;
    }

    public void setSexoCliente(String SexoCliente) {
        this.SexoCliente = SexoCliente;
    }

    public int getContatoCliente() {
        return ContatoCliente;
    }

    public void setContatoCliente(int ContatoCliente) {
        this.ContatoCliente = ContatoCliente;
    }
    
    public void Cadastrar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Clientes/cliente"+this.NomeCliente+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.IDCliente);
            pw.println(this.NomeCliente);
            pw.println(this.IdadeCliente);
            pw.println(this.SexoCliente);
            pw.println(this.ContatoCliente);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Atualizar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Clientes/cliente"+this.NomeCliente+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.IDCliente);
            pw.println(this.NomeCliente);
            pw.println(this.IdadeCliente);
            pw.println(this.SexoCliente);
            pw.println(this.ContatoCliente);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Cliente Atualizado!");
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Deletar(String nome){
        File f = new File("../CRUD_PRONTO/Clientes/cliente"+nome+".txt");
        f.delete();
        JOptionPane.showMessageDialog(null,"Cliente Deletado!");
    }

     
}
