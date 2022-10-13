package worker;

import io.dropwizard.Configuration;
import javax.validation.constraints.NotEmpty;

public class WorkerConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";
}