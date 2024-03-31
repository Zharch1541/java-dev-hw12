package test;

import entity.Client;
import entity.Planet;
import services.ClientCrudService;
import services.PlanetCrudService;

public class Main {
    public static void main(String[] args) {
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();

        /*clientService.deleteClient(clientToDelete(12L, "Vasyl"));
        planetService.deletePlanet(planetToDelete("NEP", "Neptun"));*/
        planetService.createPlanet(preparePlanet("NEP", "Neptun"));
    }

    private static Client prepareClient(String name) {
        Client client = new Client();
        client.setName(name);
        return client;
    }

    private static Client clientToDelete(Long id, String name) {
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        return client;
    }

    private static Planet preparePlanet(String id, String name) {
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        return planet;
    }

    private static Planet planetToDelete(String id, String name) {
        Planet planet = new Planet();
        planet.setId(id);
        planet.setName(name);
        return planet;
    }
}
