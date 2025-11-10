package strategy_example;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Route {
}

interface RouteStrategy {
    Route buildRoute(Point a, Point b);
}

class BusStrategy implements RouteStrategy {
    @Override
    public Route buildRoute(Point a, Point b) {
        // Implementación específica para buses...
        return new Route();
    }
}

class WalkingStrategy implements RouteStrategy {
    @Override
    public Route buildRoute(Point a, Point b) {
        // Implementación específica para caminatas...
        return new Route();
    }
}

class Navigator {
    private RouteStrategy routeStrategy;

    public Route buildRoute(Point a, Point b) {
        return routeStrategy.buildRoute(a, b);
    }

    public void setStrategy(RouteStrategy s) {
        this.routeStrategy = s;
    }
}

class Client {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(5, 2);

        // El cliente conoce la estrategia a utilizar
        Navigator nav = new Navigator();

        nav.setStrategy(new BusStrategy());
        Route busRoute = nav.buildRoute(a, b);

        nav.setStrategy(new WalkingStrategy());
        Route walkingRoute = nav.buildRoute(a, b);
    }
}