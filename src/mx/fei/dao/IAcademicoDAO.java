package mx.fei.dao;

import mx.fei.domain.Academico;

import java.util.ArrayList;

public interface IAcademicoDAO {

    ArrayList<Academico> buscaAcademicosPorNombre(String nombre);

    ArrayList<Academico> obtenAcademicoPorMatricula(String matricula);

    ArrayList<Academico> obtenerTodosAcademicos();

    boolean agregaAcademico(Academico academico);

    boolean eliminaAcademico(String matricula);}

