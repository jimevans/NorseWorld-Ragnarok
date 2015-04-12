/*
 *  "NorseWorld: Ragnarok", a roguelike game for PCs.
 *  Copyright (C) 2002-2008, 2014 by Serg V. Zhdanovskih (aka Alchemist).
 *
 *  This file is part of "NorseWorld: Ragnarok".
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nwr.core.types;

import jzrlib.core.IExtEnum;
import nwr.core.RS;

/**
 *
 * @author Serg V. Zhdanovskih
 */
public enum ItemState implements IExtEnum
{
    is_Normal(0, RS.rs_Reserved, 1f, 0, ""),
    is_Blessed(1, RS.rs_Blessed, 1.6f, 1, "blessed"),
    is_Cursed(2, RS.rs_Cursed, 0.4f, -1, "cursed");

    private final int fValue;

    public int NameRS;
    public float Factor;
    public byte CompareValue;
    public String Sign;

    private ItemState(int value, int nameRS, float factor, int compareValue, String sign)
    {
        this.fValue = value;
        this.NameRS = nameRS;
        this.Factor = factor;
        this.CompareValue = (byte) compareValue;
        this.Sign = sign;
    }

    @Override
    public int getValue()
    {
        return this.fValue;
    }

    public static ItemState forValue(int value)
    {
        return values()[value];
    }
}
