package com.portfolio.controllers;

import com.portfolio.models.Project;
import com.portfolio.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }

    @GetMapping("/new")
    public String showProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "project-form"; // This should point to a form template for creating a new project
    }

    @PostMapping
    public String createProject(@ModelAttribute Project project) {
        projectService.saveProject(project);
        return "redirect:/projects"; // Redirect to the projects list after saving
    }
}