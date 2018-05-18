package mx.fei.dao;

import mx.fei.domain.Academico;

import java.util.ArrayList;

public interface ICoordinadorAcademicoDAO {

    ArrayList<Academico> buscaCoordinadorPorNombre(String nombre);

    ArrayList<Academico> obtenCoordinadorPorMatricula(String matricula);

    ArrayList<Academico> obtenerCoordinadores();

    boolean asignarCoordinador(String matricula, int idAcademia);

    boolean cambiarCoordinador(String matricula, int idAcademia);

}
