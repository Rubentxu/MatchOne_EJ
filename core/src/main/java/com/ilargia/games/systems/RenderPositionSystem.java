package com.ilargia.games.systems;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectSet;
import com.ilargia.games.EntityIndexExtension;
import com.ilargia.games.components.Input;
import com.ilargia.games.components.Position;
import com.ilargia.games.core.CoreMatcher;
import com.ilargia.games.core.Entity;
import com.ilargia.games.core.InputMatcher;
import com.ilargia.games.core.Pools;
import com.ilargia.games.entitas.interfaces.IReactiveSystem;
import com.ilargia.games.entitas.interfaces.ISetPools;
import com.ilargia.games.entitas.matcher.Matcher;
import com.ilargia.games.entitas.matcher.TriggerOnEvent;


public class RenderPositionSystem implements IReactiveSystem<Entity> {

    @Override
    public TriggerOnEvent getTrigger() {
        return ((Matcher)Matcher.AllOf(CoreMatcher.Position(), CoreMatcher.View())).OnEntityAdded();
    }

    @Override
    public void execute(Array<Entity> entities) {
        for(Entity e : entities) {
            Position pos = e.getPosition();
       //     e.getView().gameObject.transform.DOMove(new Vector3(pos.x, pos.y, 0f), 0.3f);
        }
    }
}
