/*
Copyright (c) 2003-2010 Sony Pictures Imageworks Inc., et al.
All Rights Reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are
met:
* Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.
* Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.
* Neither the name of Sony Pictures Imageworks nor the names of its
  contributors may be used to endorse or promote products derived from
  this software without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package org.OpenColorIO;
import org.OpenColorIO.*;

public class DisplayTransform extends Transform
{
    public DisplayTransform() { super(); }
    protected DisplayTransform(long impl) { super(impl); }
    public native DisplayTransform Create();
    public native void setInputColorSpaceName(String name);
    public native String getInputColorSpaceName();
    public native void setLinearCC(Transform cc);
    public native Transform getLinearCC();
    public native void setColorTimingCC(Transform cc);
    public native Transform getColorTimingCC();
    public native void setChannelView(Transform transform);
    public native Transform getChannelView();
    public native void setDisplay(String display);
    public native String getDisplay();
    public native void setView(String view);
    public native String getView();
    public native void setDisplayCC(Transform cc);
    public native Transform getDisplayCC();
    public native void setLooksOverride(String looks);
    public native String getLooksOverride();
    public native void setLooksOverrideEnabled(boolean enabled);
    public native boolean getLooksOverrideEnabled();
}
