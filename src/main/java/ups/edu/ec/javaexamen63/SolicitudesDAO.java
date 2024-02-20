package ups.edu.ec.javaexamen63;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.print.attribute.standard.Media;
import java.util.List;
import jakarta.faces.convert.BigDecimalConverter;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/Solicitudes")
public class SolicitudesDAO {
	
	@POST//: Esta anotación indica que este método manejará las solicitudes HTTP POST. 
    public List<Cuota> registrarSolicitud(Solicitudes solicitud) {
        BigDecimal interes = solicitud.getMonto().multiply(new BigDecimal("0.10"));
        BigDecimal cuotaCapital = solicitud.getMonto().divide(new BigDecimal(solicitud.getMeses()), 2, BigDecimal.ROUND_HALF_UP);
        BigDecimal cuotaInteres = interes.divide(new BigDecimal(solicitud.getMeses()), 2, BigDecimal.ROUND_HALF_UP);

        List<Cuota> cuotas = new ArrayList<>();
        BigDecimal montoRestante = solicitud.getMonto();

        for (int i = 1; i <= solicitud.getMeses(); i++) {
            Cuota cuota = new Cuota();
            cuota.setNumeroCuota(i);
            
            // Ajusta la última cuota para que la suma total sea igual al monto original
            if (i == solicitud.getMeses()) {
                cuota.setCuotaCapital(montoRestante);
            } else {
                cuota.setCuotaCapital(cuotaCapital);
            }

            cuota.setCuotaInteres(cuotaInteres);
            cuota.setCuotaTotal(cuota.getCuotaCapital().add(cuota.getCuotaInteres()));
            
            // Actualiza el monto restante
            montoRestante = montoRestante.subtract(cuota.getCuotaCapital());

            cuotas.add(cuota);
        }

        return cuotas;
    }
}
