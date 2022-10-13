package worker;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;

import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.assets.AssetsBundle;
sdf
public class WorkerApplication extends Application<WorkerConfiguration> {
    public static void main(String[] args) throws Exception {
        new WorkerApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }
;
    @Override
    public void initialize(Bootstrap<WorkerConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addBundle(new AssetsBundle()); 

    }

    @Override
    public void run(WorkerConfiguration configuration, Environment environment) {
    }
}