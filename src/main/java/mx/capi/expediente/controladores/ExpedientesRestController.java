package mx.capi.expediente.controladores;

import mx.capi.expediente.Modelo.Expediente;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class ExpedientesRestController {

    @RestController
    @RequestMapping("/api/v1")
    public static class ExpedienteRestController {

        //http://localhost:8080/api/v1
        @GetMapping ("/")
        public ResponseEntity<String> getRoot(){
            return ResponseEntity.ok("OK Api vivo");
        }

        @GetMapping(value = "/expedientes/{id}",
                produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Expediente> getExpediente(@PathVariable Long id){
            if (id.equals(1111L)) {
                Expediente exp2 = new Expediente(1111L, "algo", "algo mas largo");
                return ResponseEntity.status(HttpStatus.OK).body(exp2);
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

        }
        @PostMapping("/expediente/")
        public ResponseEntity<Expediente> newExpediente(){
            return null;
        }
    }
}