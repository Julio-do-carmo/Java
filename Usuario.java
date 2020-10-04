
package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Usuario{
    protected int IDUsuario;
    protected String NomeUsuario;
    protected int IdadeUsuario;
    protected String SexoUsuario;
    protected String SenhaUsuario;
    
    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    public int getIdadeUsuario() {
        return IdadeUsuario;
    }

    public void setIdadeUsuario(int IdadeUsuario) {
        this.IdadeUsuario = IdadeUsuario;
    }

    public String getSexoUsuario() {
        return SexoUsuario;
    }

    public void setSexoUsuario(String SexoUsuario) {
        this.SexoUsuario = SexoUsuario;
    }

    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }

    

    public void Cadastrar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Usuarios/usuario"+this.NomeUsuario+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.IDUsuario);
            pw.println(this.NomeUsuario);
            pw.println(this.IdadeUsuario);
            pw.println(this.SexoUsuario);
            pw.println(this.SenhaUsuario);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado!");
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Atualizar(){
        try {
            FileWriter fw = new FileWriter("../CRUD_PRONTO/Usuarios/usuario"+this.NomeUsuario+".txt",false);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(this.IDUsuario);
            pw.println(this.NomeUsuario);
            pw.println(this.IdadeUsuario);
            pw.println(this.SexoUsuario);
            pw.println(this.SenhaUsuario);
            
            pw.flush();
            
            pw.close();
            fw.close();
            
            JOptionPane.showMessageDialog(null, "Usuario Atualizado!");
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Deletar(String NomeUsuario){
        File f = new File("../CRUD_PRONTO/Usuarios/usuario"+NomeUsuario+".txt");
        f.delete();
        JOptionPane.showMessageDialog(null,"Usuario Deletado!");
    }
}
