/*
 * Copyright (c) 2011. Gridshore
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.samples.trader.app.api.portfolio.item;

import org.axonframework.domain.AggregateIdentifier;
import org.axonframework.domain.DomainEvent;

/**
 * New items have been added to the portfolio for the OrderBook of the provided identifier.
 *
 * @author Jettro Coenradie
 */
public class ItemsAddedToPortfolioEvent extends DomainEvent {
    private AggregateIdentifier orderBookIdentifier;
    private long amountOfItemsAdded;

    public ItemsAddedToPortfolioEvent(AggregateIdentifier orderBookIdentifier, long amountOfItemsAdded) {
        this.orderBookIdentifier = orderBookIdentifier;
        this.amountOfItemsAdded = amountOfItemsAdded;
    }

    public long getAmountOfItemsAdded() {
        return amountOfItemsAdded;
    }

    public AggregateIdentifier getOrderBookIdentifier() {
        return orderBookIdentifier;
    }

    public AggregateIdentifier getPortfolioIdentifier() {
        return getAggregateIdentifier();
    }
}