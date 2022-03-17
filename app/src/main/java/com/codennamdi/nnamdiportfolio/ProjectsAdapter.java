package com.codennamdi.nnamdiportfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    // We are adapting the project array 'created a constructor ProjectsAdapter'
    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    //We are checking how many items our adapter would be dealing with using 'project.Length'.
    @Override
    public int getItemCount() {
        return projects.length;
    }

    //Here the 'onCreateViewHolder' we manually have to get a Layout inflater, which is the thing that takes the layout file and build it to code so it would show on the screen.
    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        //Class variable
        private ImageView appImage;
        private TextView appTitle;
        private TextView appDescription;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            //We find ids using 'itemView.findViewById' because the adapter is a bit different.
            appImage = itemView.findViewById(R.id.image_view_project_icon);
            appTitle = itemView.findViewById(R.id.text_view_project_name);
            appDescription = itemView.findViewById(R.id.text_view_project_description);
        }

        public void bind(Project project) {
            appTitle.setText(project.name);
            appDescription.setText(project.description);
            appImage.setImageResource(project.image);
        }
    }
}
