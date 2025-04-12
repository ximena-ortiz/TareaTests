package com.loscuchurrumines.dao;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.loscuchurrumines.config.NeonConnection;
import com.loscuchurrumines.model.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ NeonConnection.class })
public class ProyectoDAOTest {

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockStatement;

    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        PowerMockito.mockStatic(NeonConnection.class);
        when(NeonConnection.getConnection()).thenReturn(mockConnection);
    }

    @Test
    public void testProyectoDefaultController() {
        Proyecto proyecto = new Proyecto(
            1,
            "Proyecto Test",
            "Descripcion Test",
            "Objetivo Test",
            1,
            1,
            1
        );
        assertEquals(1, proyecto.getIdProyecto());
        assertEquals("Proyecto Test", proyecto.getNombre());
        assertEquals("Descripcion Test", proyecto.getDescripcion());
        assertEquals("Objetivo Test", proyecto.getObjetivo());
        assertEquals(1, proyecto.getFkRegion());
        assertEquals(1, proyecto.getFkUser());
        assertEquals(1, proyecto.getFkFondo());
    }

    @Test
    public void testGetEstadoProyecto(){
        Proyecto proyecto = new Proyecto();
        proyecto.setEstado(true);
        assertEquals(true, proyecto.getEstado());
    }
}


