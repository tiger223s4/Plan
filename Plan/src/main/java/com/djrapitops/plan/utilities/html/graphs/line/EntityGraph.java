package com.djrapitops.plan.utilities.html.graphs.line;

import com.djrapitops.plan.data.container.TPS;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Graph about Entity Counts gathered by TPSCountTimer.
 *
 * @author Rsl1122
 * @see com.djrapitops.plan.system.tasks.TPSCountTimer
 * @since 4.2.0
 */
public class EntityGraph extends AbstractLineGraph {

    public EntityGraph(List<TPS> tpsData) {
        super(turnToPoints(tpsData));
    }

    private static List<Point> turnToPoints(List<TPS> tpsData) {
        return tpsData.stream()
                .map(tps -> new Point(tps.getDate(), tps.getEntityCount()))
                .collect(Collectors.toList());
    }
}
