package com.gboblyn.deckaround.fragment;

import android.app.DialogFragment;

public static class EnterNameDialogFragment extends DialogFragment {

	public static EnterNameDialogFragment newInstance() {
		return new EnterNameDialogFragment();
	}

	public EnterNameDialogFragment() {}

	@Override
	public void onAttach(Activity act) {
		super.onAttach(act);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		View v = inflater.inflate(R.layout.{insert_layout}, container, false);
		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
	}

	@Override
	public void onPause() {
	}

	@Override
	public void onResume() {
	}

}
