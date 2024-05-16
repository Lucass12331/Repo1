package interfaz;

import java.util.List;

import Modelos.Reporte;

public interface ReportRepository {

	//prototipos de metodos 
    List<Reporte> getAllUsers(); // llama a todos los usuarios de la bdd
    
    Reporte getUserById(int id); //llama solo a uno, por su id
    
    void addUser(Reporte user); //añade usuarios a la bdd
    
    void updateUser(Reporte user); //actualiza los usuarios de la bdd
    
    void deleteUser(int id); //eliminar usuarios de la bdd
}
