package com.ironsakit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/sotware-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(  // JSON
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, Valorant"
                ),
                new SoftwareEngineer(
                        2,
                        "Sohaib",
                        "js, node, react, sleeping"
                )
        );
    }
    
}
