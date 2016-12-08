package com.ilargia.games.core;

import com.ilargia.games.entitas.interfaces.FactoryEntity;
import java.util.Stack;
import com.ilargia.games.entitas.interfaces.IComponent;
import com.ilargia.games.entitas.EntityMetaData;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Pools {

	public Pool input;
	public Pool score;
	public Pool core;

	public Pools() {
		input = createInputPool();
		score = createScorePool();
		core = createCorePool();
	}

	public Pool createInputPool() {
		return new Pool(InputComponentIds.totalComponents, 0,
				new EntityMetaData("Input", InputComponentIds.componentNames(),
						InputComponentIds.componentTypes()), factoryEntity());
	}

	public Pool createScorePool() {
		return new Pool(ScoreComponentIds.totalComponents, 0,
				new EntityMetaData("Score", ScoreComponentIds.componentNames(),
						ScoreComponentIds.componentTypes()), factoryEntity());
	}

	public Pool createCorePool() {
		return new Pool(CoreComponentIds.totalComponents, 0,
				new EntityMetaData("Core", CoreComponentIds.componentNames(),
						CoreComponentIds.componentTypes()), factoryEntity());
	}

	public Pool[] allPools() {
		return new Pool[]{input, score, core};
	}

	public FactoryEntity<Entity> factoryEntity() {
		return (int totalComponents, Stack<IComponent>[] componentPools,
				EntityMetaData entityMetaData) -> {
			return new Entity(totalComponents, componentPools, entityMetaData);
		};
	}
}