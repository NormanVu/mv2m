/*
 *  Copyright 2015 Fabio Collini.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.cosenonjaviste.demomv2m.ui;

import android.support.design.widget.Snackbar;

import it.cosenonjaviste.demomv2m.core.MessageManager;
import it.cosenonjaviste.mv2m.Mv2mView;

public class SnackbarMessageManager implements MessageManager {

    @Override public void showMessage(Mv2mView view, int message) {
        if (view != null) {
            Snackbar.make(view.getActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG).show();
        }
    }
}
